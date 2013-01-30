/*
 * Licensed to Eolya and Dominique Bejean under one
 * or more contributor license agreements. 
 * Eolya licenses this file to you under the 
 * Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package fr.eolya.utils;

/**
 * A generic utilities class
 */
public class Utils {

	/**
	 * Sleep current thread
	 * 
	 * @param ms sleep duration in ms
	 * @return
	 */
	public static void sleep(int ms) {
		try {
			Thread.sleep(ms); // ms
		} catch (InterruptedException e) {}
	}
}
