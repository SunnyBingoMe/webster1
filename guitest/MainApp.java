package guitest;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import java.awt.Color;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class MainApp extends javax.swing.JFrame {
	private JTextField qNorth;
	private JLabel thNorth;
	private JLabel A1;
	private JLabel A2;
	private JLabel warnMessage;
	private JLabel C02;
	private JLabel C01;
	private JLabel jLabelC0;
	private JLabel jLabel4;
	private JLabel yWest;
	private JTextField varl;
	private JLabel jLabel12;
	private JLabel jLabel11;
	private JLabel jLabel10;
	private JLabel jLabel9;
	private JLabel jLabel8;
	private JLabel rAll2ForPhase1;
	private JLabel rAll2;
	private JLabel g2;
	private JLabel rAll1ForPhase2;
	private JLabel r2;
	private JLabel rAll1;
	private JLabel r1;
	private JLabel g1;
	private JLabel jLabel7;
	private JLabel jLabel6;
	private JTextField varA;
	private JLabel jLabel5;
	private JTextField varI;
	private JLabel jLabelGreen;
	private JTextField sEast;
	private JLabel jLabel3;
	private JLabel yEast;
	private JLabel ySouth;
	private JLabel yNorth;
	private JLabel jLabel2;
	private JLabel itemPhase;
	private JLabel itemY;
	private JTextField sWest;
	private JTextField sSouth;
	private JTextField sNorth;
	private JLabel thEast;
	private JTextField qWest;
	private JTextField qEast;
	private JTextField qSouth;
	private JLabel itemS;
	private JLabel itemQ;
	private JLabel jLabel1;
	private JLabel thSouth;
	private JLabel tableTitle;
	private JButton jButtonCalculate;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainApp inst = new MainApp();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public MainApp() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			//START >>  qNorth
			qNorth = new JTextField();
			getContentPane().add(qNorth);
			qNorth.setBounds(164, 65, 46, 24);
			qNorth.setText("620");
			//END <<  qNorth
			//START >>  jButtonCalculate
			jButtonCalculate = new JButton();
			getContentPane().add(jButtonCalculate);
			jButtonCalculate.setBounds(191, 270, 95, 21);
			jButtonCalculate.setText(" \u5f00\u59cb\u8ba1\u7b97");
			jButtonCalculate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					jButtonCalculateActionPerformed(evt);
				}
			});
			//END <<  jButtonCalculate
			//START >>  tableTitle
			tableTitle = new JLabel();
			getContentPane().add(tableTitle);
			tableTitle.setText("\u6d41\u91cf\u6570\u636e\u914d\u7f6e");
			tableTitle.setBounds(192, 12, 83, 16);
			//END <<  tableTitle
			//START >>  thNorth
			thNorth = new JLabel();
			getContentPane().add(thNorth);
			thNorth.setText("\u5317\u8fdb\u53e3");
			thNorth.setBounds(167, 40, 62, 16);
			//END <<  thNorth
			//START >>  thSouth
			thSouth = new JLabel();
			getContentPane().add(thSouth);
			thSouth.setText("\u5357\u8fdb\u53e3");
			thSouth.setBounds(232, 40, 62, 16);
			//END <<  thSouth
			//START >>  thEast
			thEast = new JLabel();
			getContentPane().add(thEast);
			thEast.setText("\u4e1c\u8fdb\u53e3");
			thEast.setBounds(328, 40, 62, 16);
			//END <<  thEast
			//START >>  jLabel1
			jLabel1 = new JLabel();
			getContentPane().add(jLabel1);
			jLabel1.setText("\u897f\u8fdb\u53e3");
			jLabel1.setBounds(394, 41, 62, 16);
			//END <<  jLabel1
			//START >>  itemQ
			itemQ = new JLabel();
			getContentPane().add(itemQ);
			itemQ.setText("\u4ea4\u901a\u91cf q (pcu/h)");
			itemQ.setBounds(49, 69, 104, 16);
			//END <<  itemQ
			//START >>  itemS
			itemS = new JLabel();
			getContentPane().add(itemS);
			itemS.setText("\u9971\u548c\u6d41\u91cf s (pcu/h)");
			itemS.setBounds(49, 103, 104, 16);
			//END <<  itemS
			//START >>  qSouth
			qSouth = new JTextField();
			getContentPane().add(qSouth);
			qSouth.setText("720");
			qSouth.setBounds(229, 64, 46, 24);
			//END <<  qSouth
			//START >>  qEast
			qEast = new JTextField();
			getContentPane().add(qEast);
			qEast.setText("390");
			qEast.setBounds(328, 64, 46, 24);
			//END <<  qEast
			//START >>  qWest
			qWest = new JTextField();
			getContentPane().add(qWest);
			qWest.setText("440");
			qWest.setBounds(394, 64, 46, 24);
			//END <<  qWest
			//START >>  sNorth
			sNorth = new JTextField();
			getContentPane().add(sNorth);
			sNorth.setText("2400");
			sNorth.setBounds(165, 101, 46, 21);
			//END <<  sNorth
			//START >>  sSouth
			sSouth = new JTextField();
			getContentPane().add(sSouth);
			sSouth.setText("2400");
			sSouth.setBounds(229, 101, 46, 21);
			//END <<  sSouth
			//START >>  sEast
			sEast = new JTextField();
			getContentPane().add(sEast);
			sEast.setText("1000");
			sEast.setBounds(328, 101, 46, 21);
			//END <<  sEast
			//START >>  sWest
			sWest = new JTextField();
			getContentPane().add(sWest);
			sWest.setText("1000");
			sWest.setBounds(394, 101, 46, 21);
			//END <<  sWest
			//START >>  itemY
			itemY = new JLabel();
			getContentPane().add(itemY);
			itemY.setText("\u6d41\u91cf\u6bd4 y");
			itemY.setBounds(49, 136, 104, 16);
			//END <<  itemY
			//START >>  itemPhase
			itemPhase = new JLabel();
			getContentPane().add(itemPhase);
			itemPhase.setText("\u76f8\u4f4d\u5212\u5206");
			itemPhase.setBounds(49, 165, 104, 16);
			//END <<  itemPhase
			//START >>  jLabel2
			jLabel2 = new JLabel();
			getContentPane().add(jLabel2);
			jLabel2.setText("\u7b2c\u4e00\u76f8\u4f4d");
			jLabel2.setBounds(195, 165, 62, 16);
			//END <<  jLabel2
			//START >>  jLabel3
			jLabel3 = new JLabel();
			getContentPane().add(jLabel3);
			jLabel3.setText("\u7b2c\u4e8c\u76f8\u4f4d");
			jLabel3.setBounds(357, 165, 62, 16);
			//END <<  jLabel3
			//START >>  yNorth
			yNorth = new JLabel();
			getContentPane().add(yNorth);
			yNorth.setText("-");
			yNorth.setBounds(165, 136, 45, 16);
			//END <<  yNorth
			//START >>  ySouth
			ySouth = new JLabel();
			getContentPane().add(ySouth);
			ySouth.setText("-");
			ySouth.setBounds(229, 136, 46, 16);
			//END <<  ySouth
			//START >>  yEast
			yEast = new JLabel();
			getContentPane().add(yEast);
			yEast.setText("-");
			yEast.setBounds(328, 136, 46, 16);
			//END <<  yEast
			//START >>  jLabelGreen
			jLabelGreen = new JLabel();
			getContentPane().add(jLabelGreen);
			jLabelGreen.setText("\u7eff\u706f\u95f4\u9694 (s)");
			jLabelGreen.setBounds(86, 239, 73, 16);
			//END <<  jLabelGreen
			//START >>  varI
			varI = new JTextField();
			getContentPane().add(varI);
			varI.setText("7");
			varI.setBounds(158, 237, 23, 21);
			//END <<  varI
			//START >>  jLabel5
			jLabel5 = new JLabel();
			getContentPane().add(jLabel5);
			jLabel5.setText("\u9ec4\u706f (s)");
			jLabel5.setBounds(199, 239, 46, 16);
			//END <<  jLabel5
			//START >>  varA
			varA = new JTextField();
			getContentPane().add(varA);
			varA.setText("3");
			varA.setBounds(245, 236, 24, 23);
			//END <<  varA
			//START >>  jLabel6
			jLabel6 = new JLabel();
			getContentPane().add(jLabel6);
			jLabel6.setText("\u542f\u52a8\u635f\u5931 (s)");
			jLabel6.setBounds(287, 239, 76, 16);
			//END <<  jLabel6
			//START >>  jLabel7
			jLabel7 = new JLabel();
			getContentPane().add(jLabel7);
			jLabel7.setText("\u5176\u5b83\u6570\u636e");
			jLabel7.setBounds(195, 208, 85, 16);
			//END <<  jLabel7
			//START >>  g1
			g1 = new JLabel();
			getContentPane().add(g1);
			g1.setBounds(155, 331, 101, 16);
			g1.setBackground(Color.green);
			g1.setOpaque(true);
			//END <<  g1
			//START >>  A1
			A1 = new JLabel();
			getContentPane().add(A1);
			A1.setBounds(256, 331, 21, 16);
			A1.setBackground(Color.yellow);
			A1.setOpaque(true);
			//END <<  A1
			//START >>  r1
			r1 = new JLabel();
			getContentPane().add(r1);
			r1.setBounds(291, 331, 115, 16);
			r1.setBackground(Color.red);
			r1.setOpaque(true);
			//END <<  r1
			//START >>  rAll1
			rAll1 = new JLabel();
			getContentPane().add(rAll1);
			rAll1.setBounds(277, 331, 14, 16);
			rAll1.setBackground(Color.magenta);
			rAll1.setOpaque(true);
			//END <<  rAll1
			//START >>  r2
			r2 = new JLabel();
			getContentPane().add(r2);
			r2.setBounds(155, 355, 122, 16);
			r2.setBackground(Color.red);
			r2.setOpaque(true);
			//END <<  r2
			//START >>  rAll1ForPhase2
			rAll1ForPhase2 = new JLabel();
			getContentPane().add(rAll1ForPhase2);
			rAll1ForPhase2.setBounds(277, 355, 14, 16);
			rAll1ForPhase2.setBackground(Color.magenta);
			rAll1ForPhase2.setOpaque(true);
			//END <<  rAll1ForPhase2
			//START >>  g2
			g2 = new JLabel();
			getContentPane().add(g2);
			g2.setBounds(291, 355, 93, 16);
			g2.setBackground(Color.green);
			g2.setOpaque(true);
			//END <<  g2
			//START >>  A2
			A2 = new JLabel();
			getContentPane().add(A2);
			A2.setBounds(384, 355, 22, 16);
			A2.setBackground(Color.yellow);
			A2.setOpaque(true);
			//END <<  A2
			//START >>  rAll2
			rAll2 = new JLabel();
			getContentPane().add(rAll2);
			rAll2.setBounds(406, 355, 15, 16);
			rAll2.setBackground(Color.magenta);
			rAll2.setOpaque(true);
			//END <<  rAll2
			//START >>  rAll2ForPhase1
			rAll2ForPhase1 = new JLabel();
			getContentPane().add(rAll2ForPhase1);
			rAll2ForPhase1.setBounds(406, 331, 15, 16);
			rAll2ForPhase1.setBackground(Color.magenta);
			rAll2ForPhase1.setOpaque(true);
			//END <<  rAll2ForPhase1
			//START >>  jLabel8
			jLabel8 = new JLabel();
			getContentPane().add(jLabel8);
			jLabel8.setText("\u7b2c\u4e00\u76f8\u4f4d");
			jLabel8.setBounds(195, 165, 62, 16);
			//END <<  jLabel8
			//START >>  jLabel9
			jLabel9 = new JLabel();
			getContentPane().add(jLabel9);
			jLabel9.setText("\u7b2c\u4e8c\u76f8\u4f4d");
			jLabel9.setBounds(357, 165, 62, 16);
			//END <<  jLabel9
			//START >>  jLabel10
			jLabel10 = new JLabel();
			getContentPane().add(jLabel10);
			jLabel10.setText("\u7b2c\u4e00\u76f8\u4f4d");
			jLabel10.setBounds(195, 165, 62, 16);
			//END <<  jLabel10
			//START >>  jLabel11
			jLabel11 = new JLabel();
			getContentPane().add(jLabel11);
			jLabel11.setText("\u7b2c\u4e00\u76f8\u4f4d");
			jLabel11.setBounds(49, 331, 67, 16);
			//END <<  jLabel11
			//START >>  jLabel12
			jLabel12 = new JLabel();
			getContentPane().add(jLabel12);
			jLabel12.setText("\u7b2c\u4e8c\u76f8\u4f4d");
			jLabel12.setBounds(49, 353, 67, 16);
			//END <<  jLabel12
			//START >>  varl
			varl = new JTextField();
			getContentPane().add(varl);
			varl.setText("3");
			varl.setBounds(363, 236, 21, 23);
			//END <<  varl
			//START >>  yWest
			yWest = new JLabel();
			getContentPane().add(yWest);
			yWest.setBounds(394, 137, 46, 16);
			//END <<  yWest
			//START >>  jLabel4
			jLabel4 = new JLabel();
			getContentPane().add(jLabel4);
			jLabel4.setText("\u6700\u4f73\u5468\u671f\u957f\u5ea6");
			jLabel4.setBounds(49, 303, 85, 16);
			//END <<  jLabel4
			//START >>  jLabelC0
			jLabelC0 = new JLabel();
			getContentPane().add(jLabelC0);
			jLabelC0.setText("-");
			jLabelC0.setBounds(155, 303, 44, 16);
			jLabelC0.setBackground(Color.lightGray); 
			jLabelC0.setOpaque(true);
			//END <<  jLabelC0
			//START >>  C01
			C01 = new JLabel();
			getContentPane().add(C01);
			C01.setText("-");
			C01.setBounds(433, 331, 37, 16);
			C01.setBackground(Color.lightGray); 
			C01.setOpaque(true);
			//END <<  C01
			//START >>  C02
			C02 = new JLabel();
			getContentPane().add(C02);
			C02.setText("-");
			C02.setBounds(433, 355, 37, 16);
			C02.setBackground(Color.lightGray); 
			C02.setOpaque(true);
			//END <<  C02
			//START >>  warnMessage
			warnMessage = new JLabel();
			getContentPane().add(warnMessage);
			warnMessage.setBounds(199, 303, 271, 16);
			//END <<  warnMessage
			pack();
			this.setSize(518, 429);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void jButtonCalculateActionPerformed(ActionEvent evt) {
		warnMessage.setText("请确认您输入的数据格式正确, 或重新运行程序");
		
		/* get config values */
		int qN = Integer.parseInt(qNorth.getText().trim());
		int qS = Integer.parseInt(qSouth.getText().trim());
		int qE = Integer.parseInt(qEast.getText().trim());
		int qW = Integer.parseInt(qWest.getText().trim());
		int sN = Integer.parseInt(sNorth.getText().trim());
		int sS = Integer.parseInt(sSouth.getText().trim());
		int sE = Integer.parseInt(sEast.getText().trim());
		int sW = Integer.parseInt(sWest.getText().trim());
		
		int I = Integer.parseInt(varI.getText().trim());
		int A = Integer.parseInt(varA.getText().trim());
		int l = Integer.parseInt(varl.getText().trim());
			
		double yN = (double) qN/sN;
		double yS = (double) qS/sS;
		double yE = (double) qE/sE;
		double yW = (double) qW/sW;
		double yMax1 = Math.max(yN,yS);
		double yMax2 = Math.max(yE,yW);
		
		/* 1. 流量比  */
		yNorth.setText(String.valueOf(yN));
		ySouth.setText(String.valueOf(yS));
		yEast.setText(String.valueOf(yE));
		yWest.setText(String.valueOf(yW));
		
		/* 2. 总损失时间 */
		int L = 2 * (l + I - A);
		
		/* 3. 最佳周期长度 */
		double Y = yMax1 + yMax2;
		double C = (1.5 * L + 5) / (1 - Y);
		int CRound = (int) Math.round(C);
		int C0 = Math.max(Math.min(CRound, 120), 25);
		
		/* 4. 周期有效绿灯时间 */
		int Ge = C0 - L;

		/* 5. 相位有效绿灯时间 */
		double ge1 = Ge * yMax1/Y;
		ge1 = (int) Math.round(ge1);
		double ge2 = Ge * yMax2/Y;
		ge2 = (int) Math.round(ge2);
		
		/* 6. 各相位显示绿灯时间 */
		int green1 = (int) (ge1 - A + l);
		int green2 = (int) (ge2 - A + l);
		
		int rAllOfPhase1 = I - A;
		int rAllOfPhase2 = I - A;
		
		int red1 = green2 + A;
		int red2 = green1 + A;
		
		/* 画图 */
		g1.setText(String.valueOf(green1));
		g2.setText(String.valueOf(green2));
		A1.setText(String.valueOf(A));
		A2.setText(String.valueOf(A));
		r1.setText(String.valueOf(red1));
		r2.setText(String.valueOf(red2));
		rAll1.setText(String.valueOf(rAllOfPhase1));
		rAll1ForPhase2.setText(String.valueOf(rAllOfPhase1));
		rAll2.setText(String.valueOf(rAllOfPhase2));
		rAll2ForPhase1.setText(String.valueOf(rAllOfPhase2));
		
		jLabelC0.setText(String.valueOf(C0) + " s");
		C01.setText(String.valueOf(green1+A+rAllOfPhase1) + " s");
		C02.setText(String.valueOf(green2+A+rAllOfPhase2) + " s");
		
		if (C0 != CRound){
			warnMessage.setText("警告: 周期突破限制  25~120s !");	
		}else {
			warnMessage.setText("");
		}

	}

}
