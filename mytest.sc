import model.MyTodo

object mytest {
  var c1 = List[model.MyTodo]()                   //> c1  : List[model.MyTodo] = List()

  var pk = MyTodo(8, "zzzz") :: MyTodo(2, "bbbb") :: MyTodo(1, "cccc") :: c1
                                                  //> pk  : List[model.MyTodo] = List({id:8 titel:zzzz desc:}, {id:2 titel:bbbb de
                                                  //| sc:}, {id:1 titel:cccc desc:})

  pk.sortWith((x, y) => x.id < y.id)              //> res0: List[model.MyTodo] = List({id:1 titel:cccc desc:}, {id:2 titel:bbbb de
                                                  //| sc:}, {id:8 titel:zzzz desc:})
  pk.sortWith((x, y) => x.title.compareTo(y.title) < 0)
                                                  //> res1: List[model.MyTodo] = List({id:2 titel:bbbb desc:}, {id:1 titel:cccc de
                                                  //| sc:}, {id:8 titel:zzzz desc:})

  val funByName = (x: model.MyTodo, y: model.MyTodo) => x.title.compareTo(y.title) < 0
                                                  //> funByName  : (model.MyTodo, model.MyTodo) => Boolean = <function2>

  pk.sortWith((x, y) => funByName(x, y))          //> res2: List[model.MyTodo] = List({id:2 titel:bbbb desc:}, {id:1 titel:cccc de
                                                  //| sc:}, {id:8 titel:zzzz desc:})
  val funById = (x: model.MyTodo, y: model.MyTodo) => x.id< y.id
                                                  //> funById  : (model.MyTodo, model.MyTodo) => Boolean = <function2>
  
  pk.sortWith((x, y) => funByName(x, y) & funById(x,y))
                                                  //> res3: List[model.MyTodo] = List({id:2 titel:bbbb desc:}, {id:1 titel:cccc de
                                                  //| sc:}, {id:8 titel:zzzz desc:})

}