
public  class ReservedWords {

	public ReservedWords() {
		// TODO Auto-generated constructor stub
		
		
//		Java Language Keywords

//		Here is a list of keywords in the Java programming language. You cannot use any of the following as identifiers in your programs.
//		 The keywords const and goto are reserved, even though they are not currently used. 
//		 true, false, and null might seem like keywords, but they are actually literals; you cannot use them as identifiers in your programs.

		abstract	continue	for	    	new	    	switch
		assert***	default	    goto*		package		synchronized
		boolean		do    		if			private		this
		break		double		implements	protected	throw
		byte		else		import		public		throws
		case		enum****	instanceof	return		transient
		catch		extends		int			short		try
		char		final		interface	static		void
		class		finally		long		strictfp**	volatile
		const*		float		native		super		while
//		*	 	not used
//		**	 	added in 1.2
//		***	 	added in 1.4
//		****	 	added in 5.0
			
// MIKE
// ones I am not too familiar with:
			abstract
			throw
			throws
			enum
			transient
			byte vs char
			finally
			strictfp
			volatile
			native  ( jni)
			
// When to declare a class abstract?
			
			
// MIKE: varargs			
public static String format(String pattern,
              Object... arguments);   // MIKE funky syntax is varargs

The three periods after the final parameter's type indicate that the final argument 
may be passed as an array or as a sequence of arguments. 
Varargs can be used only in the final argument position
			
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
