import model.MyTodo

object mytest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(69); 
  var c1 = List[model.MyTodo]();System.out.println("""c1  : List[model.MyTodo] = """ + $show(c1 ));$skip(79); 

  var pk = MyTodo(8, "zzzz") :: MyTodo(2, "bbbb") :: MyTodo(1, "cccc") :: c1;System.out.println("""pk  : List[model.MyTodo] = """ + $show(pk ));$skip(39); val res$0 = 

  pk.sortWith((x, y) => x.id < y.id);System.out.println("""res0: List[model.MyTodo] = """ + $show(res$0));$skip(56); val res$1 = 
  pk.sortWith((x, y) => x.title.compareTo(y.title) < 0);System.out.println("""res1: List[model.MyTodo] = """ + $show(res$1));$skip(89); 

  val funByName = (x: model.MyTodo, y: model.MyTodo) => x.title.compareTo(y.title) < 0;System.out.println("""funByName  : (model.MyTodo, model.MyTodo) => Boolean = """ + $show(funByName ));$skip(43); val res$2 = 

  pk.sortWith((x, y) => funByName(x, y));System.out.println("""res2: List[model.MyTodo] = """ + $show(res$2));$skip(65); 
  val funById = (x: model.MyTodo, y: model.MyTodo) => x.id< y.id;System.out.println("""funById  : (model.MyTodo, model.MyTodo) => Boolean = """ + $show(funById ));$skip(59); val res$3 = 
  
  pk.sortWith((x, y) => funByName(x, y) & funById(x,y));System.out.println("""res3: List[model.MyTodo] = """ + $show(res$3))}

}
