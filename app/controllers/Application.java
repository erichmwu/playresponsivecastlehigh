package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Alumni;
import views.html.Contact;
import views.html.Facultystaff;
import views.html.Index;
import views.html.Studentparents;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render());
  }

  /**
   * Returns the students/parents page.
   * @return The resulting students/parents page.
   */
  public static Result studentsParents() {
    return ok(Studentparents.render());
  }

  /**
   * Returns the students/parents page.
   * @return The resulting students/parents page.
   */
  public static Result facultyStaff() {
    return ok(Facultystaff.render());
  }

  /**
   * Returns the alumni page.
   * @return The resulting alumni page.
   */
  public static Result alumni() {
    return ok(Alumni.render());
  }

  /**
   * Returns the contact page.
   * @return The resulting contact page.
   */
  public static Result contact() {
    return ok(Contact.render());
  }


}
