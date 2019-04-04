package org.qiuer.ast.expression;

import org.qiuer.core.Context;
import org.qiuer.exception.IException;

import java.util.List;

public class ThisExpression extends AbstractAssignPathExpression implements Expression{
  String type = "ThisExpression";

  @Override
  public Object run(Context context) throws IException {
    return null;
  }

  @Override
  public void addMemberPath(List<Object> path) {
    path.add("this");
  }
}
