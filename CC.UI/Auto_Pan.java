package CC.UI;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

/**Pane that can interface to objects automatically by putting them in it.*/
public class Auto_Pan
{
//	public static final Clas_Rap Class=Init_StRt(Auto_Pan.class,
//		Clas_Rap.class
//	);/*Dep ?done*/

	public Auto_Panbl Panbl;

	public Auto_Pan(Auto_Panbl Panbl)
	{this.Panbl=Panbl;}
	public Auto_Pan()
	{}

	/**Can be put in an {@code Auto_Pan}.*/
	public interface Auto_Panbl
	{
//		Clas_Rap Class=Init_StRt(Auto_Panbl.class,
//			Clas_Rap.class
//		);/*Dep ?done*/

		void Pan(Auto_Pan Pan);
	}

//	static{Init_Nd(Auto_Pan.class);}
}