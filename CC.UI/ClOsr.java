package CC.UI;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.Bool.Trn.Flagd_On_Trnbl.Flagd_On_Trnbl_Imp;
import java.awt.Component;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class ClOsr extends Flagd_On_Trnbl_Imp
{
//	public static final Clas_Rap Class=Init_StRt(Close.class,
//		Clas_Rap.class
//	);/*Dep ?done*/

	public Object Trn_On(Object PR)
	{
		Component Parent=((MouseEvent)PR).getComponent().getParent();
		if(Parent instanceof JFrame)
		{Parent.setVisible(false);}

		return null;
	}

	public ClOsr()
	{}

//	static{Init_Nd(Close.class);}
}