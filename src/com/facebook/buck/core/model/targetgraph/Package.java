/*
 * Copyright 2019-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.facebook.buck.core.model.targetgraph;

import com.facebook.buck.core.exceptions.DependencyStack;
import com.facebook.buck.rules.visibility.VisibilityPattern;
import com.google.common.collect.ImmutableSet;

/**
 * A {@link Package} contains attributes that are applied by default to all {@link TargetNode}s
 * contained within a build file {@link com.facebook.buck.parser.api.BuildFileManifest}. A `Package`
 * contains metadata gathered from `PACKAGE` files of the current directory/package.
 */
public interface Package extends DependencyStack.Element {

  ImmutableSet<VisibilityPattern> getVisibilityPatterns();

  ImmutableSet<VisibilityPattern> getWithinViewPatterns();
}
