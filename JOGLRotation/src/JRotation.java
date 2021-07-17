import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.JFrame;

import com.jogamp.opengl.util.FPSAnimator;

public class JRotation implements GLEventListener {
	public float rotation;   

	@Override
	public void display(GLAutoDrawable drawable) {
		final GL2 gl=drawable.getGL().getGL2();
		// Clear The Screen And The Depth Buffer  
		gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);
		
		//reset the view
		gl.glLoadIdentity();
		
		//triangle rotation
		gl.glRotatef(rotation, 0.0f, 1.0f, 0.0f);
		
		gl.glBegin(GL2.GL_TRIANGLES);
		//GREEN COLOR
		gl.glColor3f(0.0f, 1.0f, 0.0f);
		gl.glVertex2d(0, 0.5);
		gl.glVertex2d(-0.5, -0.5);
		gl.glVertex2d(0.5, -0.5);
		
		gl.glEnd();
		
		gl.glFlush();
		
		//assign angle
		rotation += 0.6f;
		
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

	
	public static void main( String[] args ) {
		
		final GLProfile gp=GLProfile.get(GLProfile.GL2);
		GLCapabilities cap =new GLCapabilities(gp);
		
		final GLCanvas gc =new GLCanvas(cap);
		JRotation jr=new JRotation();
		gc.addGLEventListener(jr);
		gc.setSize(400,400);
		
		final JFrame frame =new JFrame("JOGL Rotation");
		frame.add(gc);
		frame.setSize(500,400);
		frame.setVisible(true);
		
		final FPSAnimator animator=new FPSAnimator(gc,400,true);	
		animator.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
