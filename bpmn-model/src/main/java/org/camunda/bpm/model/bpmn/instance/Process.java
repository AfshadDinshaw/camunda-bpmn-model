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
package org.camunda.bpm.model.bpmn.instance;

import org.camunda.bpm.model.bpmn.ProcessType;
import org.camunda.bpm.model.bpmn.builder.ProcessBuilder;

import java.util.Collection;
import java.util.List;


/**
 * The BPMN process element
 *
 * @author Daniel Meyer
 * @author Sebastian Menski
 */
public interface Process extends CallableElement {

  ProcessBuilder builder();

  ProcessType getProcessType();

  void setProcessType(ProcessType processType);

  boolean isClosed();

  void setClosed(boolean closed);

  boolean isExecutable();

  void setExecutable(boolean executable);

  // TODO: collaboration ref

  Auditing getAuditing();

  void setAuditing(Auditing auditing);

  Monitoring getMonitoring();

  void setMonitoring(Monitoring monitoring);

  Collection<Property> getProperties();

  Collection<LaneSet> getLaneSets();

  Collection<FlowElement> getFlowElements();

  Collection<Artifact> getArtifacts();

  Collection<CorrelationSubscription> getCorrelationSubscriptions();

  Collection<ResourceRole> getResourceRoles();

  Collection<Process> getSupports();

  /** camunda extensions */

  String getCamundaCandidateStarterGroups();

  void setCamundaCandidateStarterGroups(String camundaCandidateStarterGroups);

  List<String> getCamundaCandidateStarterGroupsList();

  void setCamundaCandidateStarterGroupsList(List<String> camundaCandidateStarterGroupsList);

  String getCamundaCandidateStarterUsers();

  void setCamundaCandidateStarterUsers(String camundaCandidateStarterUsers);

  List<String> getCamundaCandidateStarterUsersList();

  void setCamundaCandidateStarterUsersList(List<String> camundaCandidateStarterUsersList);
}
