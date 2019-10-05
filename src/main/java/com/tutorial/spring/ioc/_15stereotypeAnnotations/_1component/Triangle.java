package com.tutorial.spring.ioc._15stereotypeAnnotations._1component;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component
//@Controller
//@Service
@Repository
public class Triangle {
	private Point pointA;
	private Side side;
	private Integer x;
	private String str;
	// private Point pointB;
	// private Point pointC;

	public Point getPointA() {
		return pointA;
	}

	// @Autowired
	// @Qualifier("triangleRelated")
	// @Resource
	@Resource(name = "dsfs")
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Side getSide() {
		return side;
	}

	@Autowired
	public void setSide(Side side) {
		this.side = side;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public void greetCustomer() {
		System.out.println("PointA: " + pointA.getX() + " " + pointA.getY());
		System.out.println("length: " + side.getLength());
		System.out.println("x= " + x);
		System.out.println("str " + str);
	}
}
