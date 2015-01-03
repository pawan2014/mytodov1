package controllers

import play.api._
import play.api.mvc._
import model.MyTodo

object TodoController extends Controller {

  def listTodo = Action {
     implicit request =>
       
      val tempList = MyTodo.findAll()

      Ok(views.html.todoWelcome.render("This is a Todo List Page",tempList ))
        
  }
    
  
   
    
  
}