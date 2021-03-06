package dotty.annotation.internal

import scala.annotation.Annotation

/** An annotation to record a Scala2 pickled alias.
 *  @param aliased  A TermRef pointing to the aliased field.
 */
class Alias(aliased: Any) extends Annotation {

}
