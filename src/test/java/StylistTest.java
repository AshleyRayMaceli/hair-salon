import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;

public class StylistTest {

  @Before
  public void setUp() {
    DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/hair_salon_am_test", null, null);
  }

  @After
  public void tearDown() {
    try(Connection con = DB.sql2o.open()) {
      String deleteClientsQuery = "DELETE FROM clients *;";
      String deleteStylistsQuery = "DELETE FROM stylists *;";
      con.createQuery(deleteClientsQuery).executeUpdate();
      con.createQuery(deleteStylistsQuery).executeUpdate();
    }
  }

  @Test
  public void Stylist_instantiatesCorrectly_true() {
    Stylist myStylist = new Stylist("Martha");
    assertEquals(true, myStylist instanceof Stylist);
  }

  @Test
  public void getName_stylistInstantiatesWithName_String() {
    Stylist myStylist = new Stylist("Clara");
    assertEquals("Clara", myStylist.getName());
  }

  @Test
  public void all_emptyAtFirst() {
    assertEquals(0, Stylist.all().size());
  }

  @Test
  public void equals_returnsTrueIfNamesAreTheSame() {
    Stylist firstStylist = new Stylist("River");
    Stylist secondStylist = new Stylist("River");
    assertTrue(firstStylist.equals(secondStylist));
  }

  @Test
  public void save_returnsTrueIfNamesAretheSame() {
    Stylist myStylist = new Stylist("Mickey");
    myStylist.save();
    assertTrue(Stylist.all().get(0).equals(myStylist));
  }

  @Test
  public void save_savesIntoDatabase_true() {
    Stylist myStylist = new Stylist("Rory");
    myStylist.save();
    Stylist savedStylist = Stylist.all().get(0);
  }

  @Test
  public void save_assignsIdToObject() {
    Stylist myStylist = new Stylist("Missy");
    myStylist.save();
    Stylist savedStylist = Stylist.all().get(0);
    assertEquals(myStylist.getId(), savedStylist.getId());
  }

  @Test
  public void find_findStylistInDatabase_true() {
    Stylist myStylist = new Stylist("Craig");
    myStylist.save();
    Stylist savedStylist = Stylist.find(myStylist.getId());
    assertTrue(myStylist.equals(savedStylist));
  }

  @Test
  public void getClients_retrievesAllClientsFromDatabase_clientsList() {
    Stylist myStylist = new Stylist("Mel");
    myStylist.save();
    Client firstClient = new Client("John Smith", myStylist.getId());
    firstClient.save();
    Client secondClient = new Client("Arthur", myStylist.getId());
    secondClient.save();
    Client[] clients = new Client[] { firstClient, secondClient };
    assertTrue(myStylist.getClients().containsAll(Arrays.asList(clients)));
  }

}
