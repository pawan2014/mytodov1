package model

import java.util.Date

case class MyTodo(var id: Long, var title: String) {

  var desc = ""
  var createdOn = new Date()
  var assignedTo = ""

  def this(id: Long, title: String, desc: String, createOn: Date, assignedTo: String) {
    this(id, title)
    this.desc = desc
    this.createdOn = createOn
    this.assignedTo = assignedTo
  }

  override def toString() = {
    "{id:" + id + " titel:" + title + " desc:" + desc + "}"
  }
}

object MyTodo {

  def apply(id: Long, title: String, desc: String, createOn: Date, assignedTo: String): MyTodo = {
    new MyTodo(id, "")

  }
  def apply(id: Long, title: String, desc: String): MyTodo = {
    new MyTodo(id, title, desc, new Date(), "")

  }

  def findAll(): List[model.MyTodo] = {
    //myList.::(MyTodo(1, ""))
    var tempList = MyTodo(2, "two Desc","Dec1") :: MyTodo(1, "one Desc","Dec2") :: myList
    myList = myList ::: tempList
    tempList
  }

  def findTodo(myId: Long): Option[model.MyTodo] = {
    val c1 = myList.filter { x => x.id == myId }
    if (c1.isEmpty) {
      None
    } else {
      Some(c1.head)
    }

  }

  def addTodo(mydoto: model.MyTodo) = {
    myList = mydoto :: myList
  }

  var myList = List[MyTodo]()

}