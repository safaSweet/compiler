package AST.Designes;

public class crossAxis extends design{
    String center ;
    String start;
    String space_around;
    String space_evenly;

    public crossAxis(String center, String start, String space_around, String space_evenly) {
        this.center = center;
        this.start = start;
        this.space_around = space_around;
        this.space_evenly = space_evenly;
    }

    public crossAxis() {
    }

    @Override
    public String toString() {
             if(start!=null&&center==null&&space_around==null&&space_evenly==null)
            return  " justify-content : "+start;
        else if(start==null&&center!=null&&space_around==null&&space_evenly==null)
            return  " justify-content : "+center;
        else if(start==null&&center==null&&space_around!=null&&space_evenly==null)
            return  " justify-content : "+space_around;
        else if(start==null&&center==null&&space_around==null&&space_evenly!=null)
            return  " justify-content : "+space_evenly;
        else return "_null_";
    }
}
