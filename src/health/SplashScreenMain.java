package health;


import javax.swing.UIManager;
import javax.swing.ImageIcon;

public class SplashScreenMain {

  SplashScreen screen;

  public SplashScreenMain() {
        splashScreenInit();
    for (int i = 0; i <= 100; i++)
    {
      for (long j=0; j<500000; ++j)
      {
        @SuppressWarnings("unused")
		String poop = " " + (j + i);
      }
            screen.setProgress("LOADING... ",i);  
    }
    splashScreenDestruct();
    @SuppressWarnings("unused")
	Form n = new Form();
  }

  private void splashScreenDestruct() {
    screen.setScreenVisible(false);
  }

  private void splashScreenInit() {
    ImageIcon myImage = new ImageIcon(SplashScreenMain.class.getResource("hcc2.jpg"));
    screen = new SplashScreen(myImage);
    screen.setLocationRelativeTo(null);
    screen.setProgressMax(100);
    screen.setScreenVisible(true);
  }

  public static void main(String[] args)
  {
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    new SplashScreenMain();
  }

}
