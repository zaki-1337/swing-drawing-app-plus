
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JColorChooser;

public class ColorChooser2 extends JPanel implements ChangeListener
{
	private JColorChooser cc;
	private final int CC_WIDTH = 400;
	private final int CC_HEIGHT = 300;
	
	private DrawFrame frame;
	
	public ColorChooser2(DrawFrame frame)
	{
		this.frame = frame;
		cc = new JColorChooser();
		cc.setPreviewPanel(new JPanel());
		cc.setPreferredSize(new Dimension(CC_WIDTH, CC_HEIGHT));
		cc.getSelectionModel().addChangeListener(this);
	}

	
	public void stateChanged(ChangeEvent e){
		this.frame.getInkPanel().setColor(cc.getColor());
	}
	
	
    public JColorChooser getColorChooser()
    {
    	return this.cc;
    }
}
