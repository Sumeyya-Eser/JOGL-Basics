import javax.swing.JFrame;  
import javax.media.opengl.*;  
import javax.media.opengl.awt.GLCanvas;  
  
  
public class SwingFrame implements GLEventListener {  
  
   @Override  
    public void init(GLAutoDrawable obj) {  
      
       }  
      
   @Override  
public void display(GLAutoDrawable obj) {  
  
   }  
  
   @Override  
public void reshape(GLAutoDrawable obj1, int obj2, int obj3, int obj4, int obj5) {  
  
   }  
      
   @Override  
public void dispose(GLAutoDrawable obj) {  
  
   }  
  
public static void main(String[] args) {  
  
  
final GLProfile gp = GLProfile.get(GLProfile.GL4);  
GLCapabilities cap = new GLCapabilities(gp);  
  
  
final GLCanvas gc = new GLCanvas(cap);  
SwingFrame sf = new SwingFrame();  
gc.addGLEventListener(sf);          
gc.setSize(350, 350);  
  
      //Now creating a frame using Frame class of AWT  
final JFrame frame = new JFrame("Swing Frame");  
  
frame.add(gc);  
frame.setSize( 500, 400 );  
frame.setVisible(true);  
   }      
}  