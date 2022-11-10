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

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.assertThrows;


@RunWith(JUnit4.class)
public class FibonacciTableTest {

  @Test
  public void fib_makesUseOfCache1() {
    // Hint: use CountingMap!
    CountingMap countingMap= new CountingMap();
    FibonacciTable fibonacciTable = new FibonacciTable(countingMap);
    fibonacciTable.fib(5);

    int count = countingMap.getCounter();
    assertThat(count).isEqualTo(2);    //uses get on fib(2) and fib(3) recursively
  }

  @Test
  public void fib_makesUseOfCache2() {
    // Hint: use CountingMap!
    CountingMap countingMap= new CountingMap();
    FibonacciTable fibonacciTable = new FibonacciTable(countingMap);
    fibonacciTable.fib(5);
    fibonacciTable.fib(4);    //use get
    fibonacciTable.fib(10);
    fibonacciTable.fib(7);     //use get
    int count = countingMap.getCounter();
    assertThat(count).isEqualTo(10);    //uses get() to fetch RHS of recursive call tree calls
  }

  @Test
  public void fib_illegalArgument(){
    // ARRANGE
    FibonacciTable fibonacci = new FibonacciTable();

    // ACT
    // ASSERT
    assertThrows(IllegalArgumentException.class, () -> fibonacci.fib(-1));
  }
}
