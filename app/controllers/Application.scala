package controllers

import play.api._
import play.api.mvc._

import play.api.db._
import play.api.Play.current
import anorm._

object Application extends Controller {

  def index = Action {
    //val ds = DB.getDataSource()

    var outString = "Number is "
    val conn = DB.getConnection()
    try {
      val stmt = conn.createStatement
      val rs = stmt.executeQuery("SELECT * from mytodo")
      while (rs.next()) {
        outString += rs.getString("idmytodo")
      }
    } catch {
      case e: Exception => println(e)

    } finally {
      conn.close()
    }

    DB.withConnection { implicit conn =>
      // do whatever you need with the connection
      
      
      val id: Option[Long] = SQL("insert into mytodo(title,mydesc) values({name},{country})")
          .on('name -> "Cambridge", 'country -> "New Zealand").executeInsert() 
 
      
    }

    DB.withConnection { implicit c =>
      val result: Boolean = SQL("Select 1").execute()
    }

    println(outString)
    Ok("ssss")
    //Redirect("todolist/")
    //Ok(views.html.index("Your new application is ready."))
  }

}