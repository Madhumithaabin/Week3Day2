package Assignments;

public class Desktop implements HardWare, Software {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop desk = new Desktop();
		desk.hardwareResources();
		desk.softwareResources();
		desk.desktopModel();
	}

	public void desktopModel() {
		System.out.println("Desktop Model");
	}

	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Software Resource");
	}

	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Harware Resource");
	}
}
