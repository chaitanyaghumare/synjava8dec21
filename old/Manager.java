package old;

import java.util.List;

public interface Manager<T>{
	  public void  insert(T d);
	  public List<T> getList();
	  public void  delete(T d);
	  public void  update(T d); 
}
