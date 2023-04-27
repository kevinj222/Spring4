package com.UST.interview.Service;

import com.UST.interview.Entity.Inter;
import com.UST.interview.Repo.InterRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.dao.OptimisticLockingFailureException;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class InterServTest {

    private InterServ interServUnderTest;

    @BeforeEach
    void setUp() {
        interServUnderTest = new InterServ();
        interServUnderTest.repo = mock(InterRepo.class);
    }

    @Test
    void testAdd() {
        // Setup
        final Inter inter = new Inter(0L, "fname", "email", "phno", "sk", "exp", "date", "link", "time", "Hr");
        final Inter expectedResult = new Inter(0L, "fname", "email", "phno", "sk", "exp", "date", "link", "time", "Hr");

        // Configure InterRepo.save(...).
        final Inter inter1 = new Inter(0L, "fname", "email", "phno", "sk", "exp", "date", "link", "time", "Hr");
        when(interServUnderTest.repo.save(
                new Inter(0L, "fname", "email", "phno", "sk", "exp", "date", "link", "time", "Hr"))).thenReturn(inter1);

        // Run the test
        final Inter result = interServUnderTest.add(inter);

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testAdd_InterRepoThrowsOptimisticLockingFailureException() {
        // Setup
        final Inter inter = new Inter(0L, "fname", "email", "phno", "sk", "exp", "date", "link", "time", "Hr");
        when(interServUnderTest.repo.save(
                new Inter(0L, "fname", "email", "phno", "sk", "exp", "date", "link", "time", "Hr")))
                .thenThrow(OptimisticLockingFailureException.class);

        // Run the test
        assertThatThrownBy(() -> interServUnderTest.add(inter)).isInstanceOf(OptimisticLockingFailureException.class);
    }

    @Test
    void testGet() {
        // Setup
        final List<Inter> expectedResult = List.of(
                new Inter(0L, "fname", "email", "phno", "sk", "exp", "date", "link", "time", "Hr"));

        // Configure InterRepo.findAll(...).
        final List<Inter> inters = List.of(
                new Inter(0L, "fname", "email", "phno", "sk", "exp", "date", "link", "time", "Hr"));
        when(interServUnderTest.repo.findAll()).thenReturn(inters);

        // Run the test
        final List<Inter> result = interServUnderTest.get();

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGet_InterRepoReturnsNoItems() {
        // Setup
        when(interServUnderTest.repo.findAll()).thenReturn(Collections.emptyList());

        // Run the test
        final List<Inter> result = interServUnderTest.get();

        // Verify the results
        assertThat(result).isEqualTo(Collections.emptyList());
    }

    @Test
    void testGetid() {
        // Setup
        final Inter expectedResult = new Inter(0L, "fname", "email", "phno", "sk", "exp", "date", "link", "time", "Hr");

        // Configure InterRepo.findById(...).
        final Optional<Inter> inter = Optional.of(
                new Inter(0L, "fname", "email", "phno", "sk", "exp", "date", "link", "time", "Hr"));
        when(interServUnderTest.repo.findById(0L)).thenReturn(inter);

        // Run the test
        final Inter result = interServUnderTest.getid(0L);

        // Verify the results
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void testGetid_InterRepoReturnsAbsent() {
        // Setup
        when(interServUnderTest.repo.findById(0L)).thenReturn(Optional.empty());

        // Run the test
        final Inter result = interServUnderTest.getid(0L);

        // Verify the results
        assertThat(result).isNull();
    }
}
