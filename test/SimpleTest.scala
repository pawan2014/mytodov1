import org.junit.Test
import org.junit.Assert._
import model.MyTodo

class SimpleTest {

  @Test def MyTodoCreation = {

    val c1  =  model.MyTodo(1, "")
    assertNotNull(c1)
    
    val c2 =  MyTodo(1,"title","mydesc")
    assertNotNull(c2)
    //println(c2.toString())
    assertEquals("mydesc", c2.desc)
    
  }
  
  @Test def testFindAll = {
    val c1 = MyTodo.findAll()
    assertEquals(3, c1.size)
    
  }
  
  @Test def testFindTodo = {
    val c1 = MyTodo.findTodo(2)
    assertEquals(2, c1.get.id)
    
  }
  
  @Test def testAddTodo = {
    var c1 = MyTodo(3,"Hello Man")
    MyTodo.addTodo(c1)
    
    val c2 = MyTodo.findTodo(3)
    assertEquals(3, c2.get.id)
    
  }
  
  
}