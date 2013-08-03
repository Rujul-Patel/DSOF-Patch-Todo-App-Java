/*
 * The MIT License
 *
 * Copyright (c) 2013, benas (md.benhassine@gmail.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package net.benas.todolist.core.service.impl;

import net.benas.todolist.core.domain.User;
import net.benas.todolist.core.repository.api.UserRepository;
import net.benas.todolist.core.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Implementation of {@link UserService}
 * @author benas (md.benhassine@gmail.com)
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User create(final User user) {
        return userRepository.create(user);
    }

    public User update(User user) {
        return userRepository.update(user);
    }

    public void remove(final User user) {
        userRepository.remove(user);
    }

    @Transactional(readOnly = true)
    public User getUserById(final long id) {
        return userRepository.getUserById(id);
    }

    @Transactional(readOnly = true)
    public User getUserByEmail(final String email) {
        return userRepository.getUserByEmail(email);
    }

    @Transactional(readOnly = true)
    public boolean login(final String email, final String password) {
        return userRepository.login(email, password);
    }
}
