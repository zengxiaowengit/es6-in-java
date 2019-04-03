package org.qiuer.ast.expression;


import org.qiuer.core.Context;
import org.qiuer.exception.IException;

import java.util.List;

public class ArrayExpression implements Expression {
  String type = "ArrayExpression";
  List<Expression> elements;

  @Override
  public Object run(Context context) throws IException {
    return null;
  }
}
