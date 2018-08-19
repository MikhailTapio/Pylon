package net.insomniakitten.pylon.annotation

import net.insomniakitten.pylon.util.Side

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

/**
 * Declares the annotated type as a Listener class. If the annotated type does
 * not implement any interfaces, a warning will be logged. Listeners rely on
 * interfaces for their implementations, and a listener with no interfaces
 * is redundant at runtime.
 * @author InsomniaKitten
 * @since 0.1.0
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Listener {
  /**
   * The loading priority of this Listener
   * @since 0.1.0
   */
  int priority() default 0

  /**
   * The physical side this Listener should be loaded on
   * By default, it will be loaded on both physical sides
   * @since 0.1.0
   */
  Side side() default Side.BOTH
}
