import javax.media.opengl.*;  
import javax.media.opengl.awt.GLCanvas;   
import com.jogamp.opengl.util.*;   
import javax.swing.JFrame;   
  
  
  
public class JLight implements GLEventListener {   
private float rotation;  
      
   @Override  
public void display( GLAutoDrawable drawable ) {  
  
final GL2 gl = drawable.getGL().getGL2();   
gl.glColor3f(1f,0f,0f);  
gl.glClear( GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT );     
gl.glLoadIdentity();         
gl.glRotatef( rotation, 1.0f, 1.0f, 0.0f );   
          
gl.glBegin(GL2.GL_TRIANGLES);     
  
gl.glVertex2d(0,0.5);  
  
gl.glVertex2d(-0.5,-0.5);  
  
gl.glVertex2d(0.5,-0.5);  
  
gl.glEnd();   
          
gl.glFlush();   
      //Angle  
rotation += 0.6f;     
  
gl.glEnable( GL2.GL_LIGHTING );    
gl.glEnable( GL2.GL_LIGHT0 );    
gl.glEnable( GL2.GL_DEPTH_TEST );    
  
float[] ambientLight = {0f, 0f, 1f,0f };    
gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_AMBIENT, ambientLight, 0);    
  
float[] specularLight = {1f, 0f, 0f,0f };    
gl.glLightfv(GL2.GL_LIGHT0, GL2.GL_SPECULAR, specularLight, 0);    
  
  
float[] diffuseLight = { 1f,0f,0f,0f };    
gl.glLightfv( GL2.GL_LIGHT0, GL2.GL_DIFFUSE, diffuseLight, 0 );   
   }    
  
   @Override   
public void dispose( GLAutoDrawable arg0 ) {   
      //method body    
   }   
  
   @Override   
public void init( GLAutoDrawable arg0 ) {   
  
   }   
      
   @Override   
public void reshape( GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4 ) {   
  
   }   
public static void main(String[] args) {  
      
    final GLProfile gp = GLProfile.get(GLProfile.GL2);  
    GLCapabilities cap = new GLCapabilities(gp);  
      
    final GLCanvas gc = new GLCanvas(cap);  
    JLight tr= new JLight();  
    gc.addGLEventListener(tr);  
    gc.setSize(400, 400);  
      
    final JFrame frame = new JFrame("JOGL Lighting");  
    frame.add(gc);  
    frame.setSize(500,400);  
    frame.setVisible(true);    
      
    final FPSAnimator animator = new FPSAnimator(gc, 400,true );   
    animator.start();   
       }  
    }  