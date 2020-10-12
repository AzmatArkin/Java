package Test;

class PC {
	CPU cpu;//定义cpu为CPU类型
	HardDisk HD;
public void setCPU(CPU c){
	cpu=c;
	}
public void setHardDisk(HardDisk h){
	HD=h;
	}
public void show() {
	System.out.println("cpu的速度："+cpu.getSpeed()+"硬盘的容量："+HD.getAmount());	
	}
			
		
}

class CPU {
	int speed; //定义CPU的速度
	void setSpeed(int m){
		speed=m;
	}
public int getSpeed(){
	 	return speed;
	}
}

class HardDisk {
	int amount;  //定义硬盘的容量
	void setAmount(int m){
		amount=m;
	}
	int getAmount(){
		return amount; 
	}
 
}

public class Test {
	public static void main(String[] args) {
    CPU cpu=new CPU(); //创建CPU对象cpu
    cpu.speed=2200; //设置cpu的速度为2200
    HardDisk disk=new HardDisk();
    disk.amount=200; //设置disk的容量为200
    PC pc=new PC();
    pc.setCPU(cpu);
    pc.setHardDisk(disk);
    pc.show();
	}
 
}