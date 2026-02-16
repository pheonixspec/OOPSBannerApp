public class OOPSbannerstringarray {

    public static void main(String args[]){
		String[] lines = new String[7];

        lines[0] = System.out.println(String.join(" " , " *****  " , " *****  " , " ****** " , "  **** "));
        lines[1] = System.out.println(String.join(" " , "*     * " , "*     * " , "*     * " , " *     "));
        lines[2] = System.out.println(String.join(" " , "*     * " , "*     * " , "*     * " , " *     "));
        lines[3] = System.out.println(String.join(" " , "*     * " , "*     * " , "******* " , " ***** "));
        lines[4] = System.out.println(String.join(" " , "*     * " , "*     * " , "*       " , "     * "));
		lines[5] = System.out.println(String.join(" " , "*     * " , "*     * " , "*       " , "     * "));
		lines[6] = System.out.println(String.join(" " , " *****  " , " *****  " , "*       " , " ****  "));
	
	for (string line : lines) {
		System.out.println(line);
	}
	}
}