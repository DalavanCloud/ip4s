/*
 * Copyright 2018 Comcast Cable Communications Management, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.comcast.ip4s
package interop.scalaz

import _root_.scalaz.{Equal, Order, Show}

trait IDNInstances {
  implicit val IDNEq: Equal[IDN] = Equal.equalA[IDN]
  implicit val IDNOrder: Order[IDN] = Order.fromScalaOrdering[IDN]
  implicit val IDNShow: Show[IDN] = Show.showFromToString[IDN]
}