import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.JFrame;

public class Triangle implements GLEventListener {

	@Override
	public void display(GLAutoDrawable drawable) {
		final GL2 gl=drawable.getGL().getGL2();
		
		//Base edge
		gl.glBegin(GL2.GL_LINES);
		gl.glVertex2d(-0.65, -0.65);
		gl.glVertex2d(0.65, -0.65);
		gl.glEnd();
		
		//Right Edge
		gl.glBegin(GL2.GL_LINES);
		gl.glVertex2d(0, 0.65);
		gl.glVertex2d(-0.65, -0.65);
		gl.glEnd();
		
		//Left edge
		gl.glBegin(GL2.GL_LINES);
		gl.glVertex2d(0, 0.65);
		gl.glVertex2d(0.65, -0.65);
		gl.glEnd();
		gl.glFlush();
	}

	@Override
	public void dispose(GLAutoDrawable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(GLAutoDrawable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
		// TODO Auto-generated method stub
		
	}

  public static void main(String[] args) {
	  
	  final GLProfile gp=GLProfile.get(GLProfile.GL2);
	  GLCapabilities cap=new GLCapabilities(gp);
	  
	  final GLCanvas gc=new GLCanvas(cap);
	  Triangle tr=new Triangle();
	  
	  gc.addGLEventListener(tr);
	  gc.setSize(400,400);
	  
	  final JFrame frame =new JFrame("JOGL triangle");
	  frame.add(gc);
	  frame.setSize(500,400);
	  frame.setVisible(true);
	  
	  
}	
}


