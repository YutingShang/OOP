/*
 * Copyright 2022 Andrew Rice <acr31@cam.ac.uk>, Y. Shang
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.ac.cam.ys606.fibonacci;

import java.util.HashMap;
import java.util.Map;

/**
 * A class for computing Fibonacci numbers using the provided cache to reuse previously computed
 * values.
 */
class FibonacciTable {
  private final Map<Integer, Integer> cache;

  /** Constructs a new object with a default cache implementation. */
  FibonacciTable() {
    this(new HashMap<>());
  }

  /**
   * Constructs a new object using the provided cache implementation.
   *
   * @param cache the cache to use for storing computed values
   */
  FibonacciTable(Map<Integer, Integer> cache) {
    this.cache = cache;
  }

  /**
   * Compute a Fibonacci number.
   *
   * @param i the index in the Fibonacci sequence
   * @return the Fibonacci number for this index
   */
  int fib(int i) {
    // use the provided cache to reuse computed values
    // cache.containsKey(4) will return true if there is a value stored for the index 4
    // cache.get(4) will return the stored value for 4
    // cache.put(4,3) will store the value 3 for the index 4 in the cache
    throw new UnsupportedOperationException();
  }
}
