package Test;

class PC {
	CPU cpu;//����cpuΪCPU����
	HardDisk HD;
public void setCPU(CPU c){
	cpu=c;
	}
public void setHardDisk(HardDisk h){
	HD=h;
	}
public void show() {
	System.out.println("cpu���ٶȣ�"+cpu.getSpeed()+"Ӳ�̵�������"+HD.getAmount());	
	}
			
		
}

class CPU {
	int speed; //����CPU���ٶ�
	void setSpeed(int m){
		speed=m;
	}
public int getSpeed(){
	 	return speed;
	}
}

class HardDisk {
	int amount;  //����Ӳ�̵�����
	void setAmount(int m){
		amount=m;
	}
	int getAmount(){
		return amount; 
	}
 
}

public class Test {
	public static void main(String[] args) {
    CPU cpu=new CPU(); //����CPU����cpu
    cpu.speed=2200; //����cpu���ٶ�Ϊ2200
    HardDisk disk=new HardDisk();
    disk.amount=200; //����disk������Ϊ200
    PC pc=new PC();
    pc.setCPU(cpu);
    pc.setHardDisk(disk);
    pc.show();
	}
 
}