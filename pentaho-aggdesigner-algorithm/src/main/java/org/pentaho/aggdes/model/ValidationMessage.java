/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied.  See the License for the specific
 * language governing permissions and limitations under the
 * License.
 */
package org.pentaho.aggdes.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/** Message emitted during validation. */
public class ValidationMessage implements Comparable<ValidationMessage> {

  /** Message severity. */
  public enum Type {
    OK, WARNING, ERROR
  }

  private Type type;

  private String message;

  public ValidationMessage(Type type, String message) {
    super();
    this.type = type;
    this.message = message;
  }

  public Type getType() {
    return type;
  }

  public String getMessage() {
    return message;
  }

  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("type", type)
        .append("message", "\"" + message + "\"")
        .toString();
  }

  public int compareTo(ValidationMessage other) {
    // first check type
    if (this.type != other.type) {
      if (this.type == Type.ERROR) {
        return -1;
      } else if (this.type == Type.WARNING) {
        if (other.type == Type.OK) {
          return -1;
        } else {
          return 1;
        }
      } else {
        return 1;
      }
    } else {
      return this.message.compareTo(other.message);
    }
  }
}

// End ValidationMessage.java
