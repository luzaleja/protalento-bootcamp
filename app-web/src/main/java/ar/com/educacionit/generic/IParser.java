package ar.com.educacionit.generic;

import java.io.IOException;

public interface IParser<T> {
	
	public T parse() throws ParseException, IOException; 
	//T puede ser cualquier cosa, como por ejemplo una Collection<T>
	
	//public Collection<T> parseFile();
	//siempre debe retornar una Collection
}