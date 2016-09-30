package com.thoughtworks.DDF

import com.thoughtworks.DDF.Lang.{Lang, NextLang}

object Preclude {
  def Square[Info[_], Repr[_]](implicit td: Info[Double], lang: Lang[Info, Repr]): Repr[Double => Double] = {
    val next = NextLang[Info, Repr, Double](lang)
    import next._
    collapse(app(app(MultD)(in))(in))
  }
}
