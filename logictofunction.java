public class logictofunction {

		public static String[] getOpattern(){
			return new String[]{
				" ******* ",
				"*       *",
				"*       *",
				"*       *",
				"*       *",
				"*       *",
				"*       *",
				"*       *",
				" ******* "
			};
		}
			public static String[] getPpattern(){
			return new String[]{
				" ******* ",
				"*       *",
				"*       *",
				"*       *",
				"******** ",
				"*        ",
				"*        ",
				"*        ",
				"*        "
			};
			}
			public static String[] getSpattern(){
			return new String[]{
				" ******* ",
				"*        ",
				"*        ",
				"*        ",
				" ******* ",
				"        *",
				"        *",
				"        *",
				" ******* "
			};
			}
			public static void main(String args[]){
			
				String[] opattern = getOpattern();
				String[] ppattern = getPpattern();
				String[] spattern = getSpattern();
				
				for(int i = 0; i < opattern.length; i++){
					System.out.println(opattern[i] + " " + opattern[i] + " " + ppattern[i] + " " + spattern[i] + " ");
				}
			}
}