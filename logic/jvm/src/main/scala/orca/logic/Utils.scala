package orca.logic

object Utils {
  def shortClassName[T](obj: T): String = {
    obj.getClass.toString.split('.').last
  }
}
