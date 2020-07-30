class Rational(x: Int, y: Int) {



  // negation
  def neg = new Rational(-numer, denom)
  def unary_- : Rational = neg


}