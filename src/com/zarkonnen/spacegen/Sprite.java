/**
Copyright 2012 David Stark

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package com.zarkonnen.spacegen;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Sprite {
	public int x;
	public int y;
	BufferedImage img;
	public ArrayList<Sprite> children = new ArrayList<Sprite>();
	public Sprite parent;
	boolean highlight;
	boolean flash;

	Sprite(BufferedImage img, int x, int y) {
		this.img = img;
		this.x = x;
		this.y = y;
	}

	public Sprite() {
	}
	
	public int globalX() {
		if (parent == null) { return x; }
		return parent.globalX() + x;
	}
	
	public int globalY() {
		if (parent == null) { return y; }
		return parent.globalY() + y;
	}
}
