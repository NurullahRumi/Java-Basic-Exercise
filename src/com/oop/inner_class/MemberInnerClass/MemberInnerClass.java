package com.oop.inner_class.MemberInnerClass;

public class MemberInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robot = new Robot(10.0, "Rumi");
        //robot.run();
        Robot.Hand hand = robot.new Hand();
        hand.move();
	}

}
