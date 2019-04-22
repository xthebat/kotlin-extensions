package ru.inforion.lab403.common.extensions

import ru.inforion.lab403.common.extensions.toUInt
import ru.inforion.lab403.common.extensions.toULong

/**
 * Created by Alexei Gladkikh on 12/06/17.
 */
inline val Long.asLong: Long get() = toLong()
inline val Long.asInt: Int get() = toInt()
inline val Long.asShort: Short get() = toShort()
inline val Long.asByte: Byte get() = toByte()
inline val Long.asFloat: Float get() = toFloat()
inline val Long.asDouble: Double get() = toDouble()

inline val Int.asLong: Long get() = toLong()
inline val Int.asULong: Long get() = toULong()
inline val Int.asInt: Int get() = toInt()
inline val Int.asShort: Short get() = toShort()
inline val Int.asByte: Byte get() = toByte()
inline val Int.asFloat: Float get() = toFloat()
inline val Int.asDouble: Double get() = toDouble()

inline val Short.asLong: Long get() = toLong()
inline val Short.asULong: Long get() = toULong()
inline val Short.asUInt: Int get() = toUInt()
inline val Short.asInt: Int get() = toInt()
inline val Short.asShort: Short get() = toShort()
inline val Short.asByte: Byte get() = toByte()
inline val Short.asFloat: Float get() = toFloat()
inline val Short.asDouble: Double get() = toDouble()

inline val Byte.asLong: Long get() = toLong()
inline val Byte.asULong: Long get() = toULong()
inline val Byte.asUInt: Int get() = toUInt()
inline val Byte.asInt: Int get() = toInt()
inline val Byte.asShort: Short get() = toShort()
inline val Byte.asByte: Byte get() = toByte()
inline val Byte.asFloat: Float get() = toFloat()
inline val Byte.asDouble: Double get() = toDouble()

inline val Char.asLong: Long get() = toLong()
inline val Char.asULong: Long get() = toULong()
inline val Char.asUInt: Int get() = toUInt()
inline val Char.asInt: Int get() = toInt()
inline val Char.asShort: Short get() = toShort()
inline val Char.asByte: Byte get() = toByte()
inline val Char.asFloat: Float get() = toFloat()
inline val Char.asDouble: Double get() = toDouble()

inline val Float.asLong: Long get() = toLong()
inline val Float.asULong: Long get() = toULong()
inline val Float.asInt: Int get() = toInt()
inline val Float.asShort: Short get() = toShort()
inline val Float.asByte: Byte get() = toByte()
inline val Float.asFloat: Float get() = toFloat()
inline val Float.asDouble: Double get() = toDouble()

inline val Double.asLong: Long get() = toLong()
inline val Double.asULong: Long get() = toULong()
inline val Double.asInt: Int get() = toInt()
inline val Double.asShort: Short get() = toShort()
inline val Double.asByte: Byte get() = toByte()
inline val Double.asFloat: Float get() = toFloat()
inline val Double.asDouble: Double get() = toDouble()