package main.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by miral on 7/6/2017.
 */
public class Complex {
    @Autowired
    List<HotDrink> list;
    Set<Integer> set;
    Map<Integer,String> map;

    @Override
    public String toString() {
        return "Complex{" +
                "list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }

    public List getList() {
        return list;
    }


    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    @Autowired
    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    @Autowired
    public void setMap(Map map) {
        this.map = map;
    }
}
