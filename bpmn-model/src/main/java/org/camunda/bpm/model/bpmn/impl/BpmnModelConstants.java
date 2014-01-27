/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.model.bpmn.impl;

/**
 * Constants used in the BPMN 2.0 Language (DI + Semantic)
 *
 * @author Daniel Meyer
 *
 */
public final class BpmnModelConstants {

  /** The BPMN 2.0 namespace */
  public static final String BPMN20_NS = "http://www.omg.org/spec/BPMN/20100524/MODEL";

  /** The location of the BPMN 2.0 XML schema. */
  public static final String BPMN_20_SCHEMA_LOCATION = "BPMN20.xsd";

  /** Xml Schema is the default type language */
  public static final String XML_SCHEMA_NS = "http://www.w3.org/2001/XMLSchema";

  public static final String XPATH_NS = "http://www.w3.org/1999/XPath";

  // elements ////////////////////////////////////////

  public static final String BPMN_ELEMENT_BASE_ELEMENT = "baseElement";
  public static final String BPMN_ELEMENT_DEFINITIONS = "definitions";
  public static final String BPMN_ELEMENT_DOCUMENTATION = "documentation";
  public static final String BPMN_ELEMENT_EXTENSION = "extension";
  public static final String BPMN_ELEMENT_EXTENSION_ELEMENTS = "extensionElements";
  public static final String BPMN_ELEMENT_IMPORT = "import";
  public static final String BPMN_ELEMENT_RELATIONSHIP = "relationship";
  public static final String BPMN_ELEMENT_SOURCE = "source";
  public static final String BPMN_ELEMENT_TARGET = "target";
  public static final String BPMN_ELEMENT_ROOT_ELEMENT = "rootElement";
  public static final String BPMN_ELEMENT_AUDITING = "auditing";
  public static final String BPMN_ELEMENT_MONITORING = "monitoring";
  public static final String BPMN_ELEMENT_CATEGORY_VALUE = "categoryValue";
  public static final String BPMN_ELEMENT_FLOW_ELEMENT = "flowElement";
  public static final String BPMN_ELEMENT_FLOW_NODE = "flowNode";
  public static final String BPMN_ELEMENT_CATEGORY_VALUE_REF = "categoryValueRef";
  public static final String BPMN_ELEMENT_EXPRESSION = "expression";
  public static final String BPMN_ELEMENT_CONDITION_EXPRESSION = "conditionExpression";
  public static final String BPMN_ELEMENT_SEQUENCE_FLOW = "sequenceFlow";
  public static final String BPMN_ELEMENT_INCOMING = "incoming";
  public static final String BPMN_ELEMENT_OUTGOING = "outgoing";

  public static final String BPMN_ELEMENT_PROCESS = "process";
  public static final String BPMN_ELEMENT_MESSAGE = "message";
  public static final String BPMN_ELEMENT_MESSAGE_EVENT_DEFINITION = "messageEventDefinition";
  public static final String BPMN_ELEMENT_START_EVENT = "startEvent";
  public static final String BPMN_ELEMENT_PROPERTY = "property";
  public static final String BPMN_ELEMENT_EVENT_DEFINITION_REF = "eventDefinitionRef";
  public static final String BPMN_ELEMENT_CALLABLE_ELEMENT = "callableElement";
  public static final String BPMN_ELEMENT_EVENT_DEFINITION = "eventDefinition";
  public static final String BPMN_ELEMENT_EVENT = "event";
  public static final String BPMN_ELEMENT_CATCH_EVENT = "catchEvent";

  // attributes //////////////////////////////////////

  public static final String BPMN_ATTRIBUTE_EXPORTER = "exporter";
  public static final String BPMN_ATTRIBUTE_EXPORTER_VERSION = "exporterVersion";
  public static final String BPMN_ATTRIBUTE_EXPRESSION_LANGUAGE = "expressionLanguage";
  public static final String BPMN_ATTRIBUTE_ID = "id";
  public static final String BPMN_ATTRIBUTE_NAME = "name";
  public static final String BPMN_ATTRIBUTE_TARGET_NAMESPACE = "targetNamespace";
  public static final String BPMN_ATTRIBUTE_TYPE_LANGUAGE = "typeLanguage";
  public static final String BPMN_ATTRIBUTE_NAMESPACE = "namespace";
  public static final String BPMN_ATTRIBUTE_LOCATION = "location";
  public static final String BPMN_ATTRIBUTE_IMPORT_TYPE = "importType";
  public static final String BPMN_ATTRIBUTE_TEXT_FORMAT = "textFormat";
  public static final String BPMN_ATTRIBUTE_PROCESS_TYPE = "processType";
  public static final String BPMN_ATTRIBUTE_IS_CLOSED = "isClosed";
  public static final String BPMN_ATTRIBUTE_IS_EXECUTABLE = "isExecutable";
  public static final String BPMN_ATTRIBUTE_DEFINITIONAL_COLLABORATION_REF = "definitionalCollaborationRef";
  public static final String BPMN_ATTRIBUTE_MESSAGE_REF = "messageRef";
  public static final String BPMN_ATTRIBUTE_DEFINITION = "definition";
  public static final String BPMN_ATTRIBUTE_MUST_UNDERSTAND = "mustUnderstand";
  public static final String BPMN_ATTRIBUTE_TYPE = "type";
  public static final String BPMN_ATTRIBUTE_DIRECTION = "direction";
  public static final String BPMN_ATTRIBUTE_SOURCE_REF = "sourceRef";
  public static final String BPMN_ATTRIBUTE_TARGET_REF = "targetRef";
  public static final String BPMN_ATTRIBUTE_IS_IMMEDIATE = "isImmediate";

}
