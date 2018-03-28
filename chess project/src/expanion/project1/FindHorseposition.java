package expanion.project1;
                        /*FUNCTIONAL CLASS TO FIND HORSE POSITION*/
public class FindHorseposition {
	                    /*FUNCTIONAL METHOD TO FIND HORSE POSITION*/
	String horseposition(byte start_row, byte start_col,byte end_row,byte end_col)
	{
	  if(start_row>=0 && start_row<=64 && start_col>=0 && start_col<=64 && end_row>=0 &&end_row<=64 &&end_col>=0 &&end_col<=64 )
      {
          if(start_row+2== end_row)
          {
              if(start_col+1 == end_col || start_col-1==end_col)
              {
                  return "valid move";
              }
          }
           if(start_row+1== end_row)
          {
              if(start_col+2 == end_col || start_col-2==end_col)
              {
            	  return "valid move";
              }
          }
          if(start_row-1== end_row)
          {
              if(start_col+2 == end_col || start_col-2==end_col)
              {
            	  return "valid move";
              }
          }
          if(start_row-2== end_row)
          {
              if(start_col+1 == end_col || start_col-1==end_col)
              {
            	  return "valid move";
              }
          }
          return "Invalid move";
         
      }
      else
      {
          return "Invalid inputs please enter the correct input";
      }
	}

}
