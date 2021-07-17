import javax.media.opengl.*;  
import javax.media.opengl.awt.GLCanvas;  
import javax.swing.JFrame;  
  
public class Square implements GLEventListener {  
  
    @Override  
public void init(GLAutoDrawable arg0)   
  {  
          
  }  
  
   @Override  
public void display(GLAutoDrawable drawable) {  
final GL2 gl = drawable.getGL().getGL2();  
  
      //Drawing top edge  
gl.glBegin( GL2.GL_LINES );  
gl.glVertex2d(-0.4, 0.4);  
gl.glVertex2d(0.4, 0.4);  
gl.glEnd();  
  
//Drawing bottom edge  
gl.glBegin( GL2.GL_LINES );  
gl.glVertex2d(-0.4,-0.4);  
gl.glVertex2d(0.4, -0.4);  
gl.glEnd();  
  
      //Drawing right edge  
gl.glBegin( GL2.GL_LINES );  
gl.glVertex2d(-0.4, 0.4);  
gl.glVertex2d(-0.4, -0.4);  
gl.glEnd();  
  
      //Drawing left edge  
gl.glBegin( GL2.GL_LINES );  
gl.glVertex2d(0.4, 0.4);  
gl.glVertex2d(0.4, -0.4);  
gl.glEnd();  
   }        
   @Override  
public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4)   
   {      
  
   }  
   @Override  
public void dispose(GLAutoDrawable arg0)   
   {  
  
   }  
  
public static void main(String[] args) {  
  
final GLProfile gp = GLProfile.get(GLProfile.GL2);  
GLCapabilities cap = new GLCapabilities(gp);  
  
final GLCanvas gc = new GLCanvas(cap);  
      Square sq = new Square();  
gc.addGLEventListener(sq);  
gc.setSize(400, 400);  
  
final JFrame frame = new JFrame("JOGL Line");  
frame.add(gc);  
frame.setSize(500,400);  
frame.setVisible(true);    
   }      
}  