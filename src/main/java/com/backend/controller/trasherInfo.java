package com.backend.controller;
import java.util.List;

import com.backend.controller.*;
import com.backend.model.*;

public class trasherInfo {
	
	private trasherRattingController trasherRattingController;
	private trasherCommentsController trasherCommentController;
	private loginAndSignup loginAndSignupController;
	public double smallTrasherRattings;
	public double primumTrasherRattings;
	public double largerTrasherRattings;
	public boolean isRatedForSmallTrasher;
	public boolean isRatedForPrimumTrasher;
	public boolean isRatedForLargerTrasher;
	private long customer_id=loginAndSignupController.getCustomerId();
	public List<trasherComments> allCommentsForSmallTrasher;
	public List<trasherComments> allCommentsForPrimumTrasher;
	public List<trasherComments> allCommentsForLargerTrasher;
	
	trasherInfo(){
		trasherRattingController.getRattings(customer_id);
		smallTrasherRattings=trasherRattingController.getSmallTrasherRattings();
		primumTrasherRattings=trasherRattingController.getPrimumTrasherRattings();
		largerTrasherRattings=trasherRattingController.getLargeTrasherRattings();
		isRatedForSmallTrasher=trasherRattingController.isRatedForSmallTrasher();
		isRatedForPrimumTrasher=trasherRattingController.isRatedForPrimumTrasher();
		isRatedForLargerTrasher=trasherRattingController.isRatedForLargerTrasher();
		allCommentsForSmallTrasher=trasherCommentController.getSmallTrasherComments();
		allCommentsForPrimumTrasher=trasherCommentController.getPrimumTrasherComments();
		allCommentsForLargerTrasher=trasherCommentController.getLargeTrasherComments();
	}

}
