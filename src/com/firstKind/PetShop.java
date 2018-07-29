package com.firstKind;

/**
 * Created by lpl on 2018/7/5.
 */
public class PetShop {
    private Pet[] pets;
    private int foot;

    public PetShop(int len) {
        if(len>0){
            pets = new Pet[len];
        }else{
            pets = new Pet[1];
        }
    }

    public boolean add(Pet pet){
        if(this.foot<this.pets.length){
            this.pets[foot] = pet;
            this.foot++;
            return true;
        }else{
            return false;
        }
    }

    public Pet[] search(String keyword){
        Pet p[] = null;
        int count = 0;
        for(int i =0;i<this.pets.length;i++){
            if(this.pets[i]!=null){
                if(this.pets[i].getName().indexOf(keyword)!=(-1)
                        || this.pets[i].getColor().indexOf(keyword) != -1){
                    count ++;
                }
            }
        }
        if(count!=0){
            p = new Pet[count];
            int j = 0;
            for(int i = 0;i<this.pets.length;i++){
                if(this.pets[i]!=null){
                    if(this.pets[i].getName().indexOf(keyword) != -1
                            || this.pets[i].getColor().indexOf(keyword) != -1){
                        p[j] = this.pets[i];
                        j++;
                    }
                }
            }
        }else{
            System.out.println("没有找到匹配数据~");
            p = new Pet[1];
        }
        return p;
    }
}

