package org.computer;

public class Desktop  extends Computer {
   private void desktopSize() {
       System.out.println("Desktop  size is --   32 inch");
}
    public static void main(String[] args) {
		    Desktop d = new Desktop();
		    d.computerModel();
		    d.desktopSize();
	}
}
