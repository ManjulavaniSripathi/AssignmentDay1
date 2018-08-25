package com.day2;

public class MultiDimension {

		public static Object searchElement(int[][] is) {
			int val_s=2;
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					if(val_s==is[i][j]) {
						return "found";
					}
				}
			}
			return null;
		}

	}


